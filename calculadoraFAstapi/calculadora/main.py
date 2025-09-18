from fastapi import FastAPI
from model.operacoes import Operacoes
app = FastAPI()

@app.get("/")
async def root():
    return {"Message" : "Calculadora com FastAPI"}

@app.get("/somar/{num1}/{num2}")
async def somar(num1:int, num2:int):
    calc = Operacoes()
    resultado = calc.somar(num1, num2)
    return {"Resultado": resultado}

@app.get("/subtrair/{num1}/{num2}")
async def subtrair(num1:int, num2:int):
    calc = Operacoes()
    resultado = calc.subtrair(num1, num2)
    return {"Resultado":resultado}

@app.get("/multiplicar/{num1}/{num2}")
async def multiplicar(num1:int, num2:int):
    calc = Operacoes()
    resultado = calc.multiplicar(num1, num2)
    return {"Resultado":resultado}

@app.get("/dividir/{num1}/{num2}")
async def dividir(num1:int, num2:int):
    calc = Operacoes()
    resultado = calc.dividir(num1, num2)
    return {"Resultado":resultado}