from typing import Any, Callable, Generic, Optional, Type, TypeVar
from fastapi import APIRouter, Depends, HTTPException, Query
from sqlmodel import SQLModel, Session
from util.database import get_session
from repository.base import Repository
from service.base import Service


ModelT = TypeVar("ModelT", bound=SQLModel)
CreateT = TypeVar("CreateT", bound=SQLModel)
UpdateT = TypeVar("UpdateT", bound=SQLModel)
ReadT   = TypeVar("ReadT", bound=SQLModel)

class Hooks(Generic[ModelT, CreateT, UpdateT]):
    def pre_create(self, payload: CreateT, session: Session) -> None: ...
    def pre_update(self, payload: UpdateT, session: Session, obj: ModelT) -> None: ...
    def pre_delete(self, session: Session, obj: ModelT) -> None: ...


def create_crud_router(
    *,
    model: Type[ModelT],
    create_schema: Type[CreateT],
    update_schema: Type[UpdateT],
    read_schema: Type[ReadT],
    prefix: str,
    tags: list[str],
    hooks: Optional[Hooks[ModelT, CreateT, UpdateT]] = None,
    page_size_limit: int = 200,
) -> APIRouter:
    
    router = APIRouter(prefix=prefix, tags=tags)

    repo: Repository[ModelT, CreateT, UpdateT] = Repository(model)
    service: Service[ModelT, CreateT, UpdateT] = Service(repo)
    _hooks = hooks or Hooks()
