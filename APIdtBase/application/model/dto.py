from model.models import PessoaBase, EnderecoBase
from typing import  List, Optional
from sqlmodel import Field



class CriarPessoa(PessoaBase):
    pass

class AtualizarPessoa(PessoaBase):
    nome: str = Field(min_length=2, max_length=120)
    dt_nasc: str = Field(min_length=8, max_length=8)
    email: str = Field(min_length=10, max_length= 120)

class LerPessoa(PessoaBase):
    id: int

class CriarEndereco(EnderecoBase):
    endereco_id: Optional[int] = None

class AtualizarEndereco(EnderecoBase):
    logradouro: str = Field(min_length = 2, max_length = 200)
    numero: str = Field(min_length = 1, max_length = 5)
    estado: str = Field(min_length = 2, max_length = 2)
    cidade: str = Field(min_length = 2, max_length = 120)

class LerEndereco(EnderecoBase):
    id: int
    morador: Optional[int] = None