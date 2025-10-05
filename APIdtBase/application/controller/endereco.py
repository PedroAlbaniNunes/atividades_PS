from controller.generic import create_crud_router
from model.models import Endereco
from model.dto import CriarEndereco, AtualizarEndereco, LerEndereco

router = create_crud_router(
    model = Endereco,
    create_schema= CriarEndereco,
    update_schema= AtualizarEndereco,
    read_schema= LerEndereco,
    prefix= "/endereco",
    tags= ["endereco"]
)