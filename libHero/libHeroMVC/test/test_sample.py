import pytest
from model.models import Hero, Team

def test_hero_create():
    """
    Testa se está criando os hero certinho
    """
    hero = Hero(name="Mulher Maravilha", secret_name= "Diana Prince", age= "5000")

    assert hero.name == "Mulher Maravilha"
    assert hero.secret_name == "Diana Prince"
    assert hero.age == "5000"

def test_team_create():
    """
    Testa se está criando o time de herois certinho
    """

    team = Team(name="Liga da Justica")
    assert team.name == "Liga da Justica"