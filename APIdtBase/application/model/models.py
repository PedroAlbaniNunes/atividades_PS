from typing import Optional, List
from sqlmodel import SQLModel, Field, Relationship


#------------------Pessoa-------------------
class PessoaBase(SQLModel):
    nome: str = Field(min_length=2, max_length=120)
    dt_nasc: str = Field(min_length=8, max_length=8)
    email: str = Field(min_length=10, max_length= 120)

class Pessoa(SQLModel):
    id: Optional[int] = Field(default = None, primary_key = True, index = True)
    endereco_id: List["Endereco"] = Relationship(back_populates = "id")

#-------------------Endereço----------------
class EnderecoBase(SQLModel):
    logradouro: str = Field(min_length = 2, max_length = 200)
    numero: str = Field(min_length = 1, max_length = 5)
    estado: str = Field(min_length = 2, max_length = 2)
    cidade: str = Field(min_length = 2, max_length = 120)

class Endereco(SQLModel):
    id: Optional[int] = Field(default = None, primary_key = True)
    morador: List[Pessoa] = Relationship(back_populates = "id")    