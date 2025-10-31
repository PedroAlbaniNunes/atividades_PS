from setuptools import setup, find_packages # type: ignore

# Lendo o README.md para o PyPI
with open("README.md", "r", encoding="utf-8") as fh:
    long_description = fh.read()

setup(
    name="libHeroMVCPHANunes",  # ⚡ Nome com hífen para o PyPI
    version="0.1.1",
    description="Biblioteca para gerenciamento de heróis e seus times.",
    long_description=long_description,
    long_description_content_type="text/markdown",
    author="Pedro Henrique Albani Nunes",
    author_email="albanipedroprofissional@gmail.com",
    url="https://github.com/PedroAlbaniNunes/atividades_PS",
    license="MIT",
    packages=find_packages(),
    install_requires=[
        "sqlmodel",
        "typing_extensions",
    ],
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
        "Operating System :: OS Independent",
    ],
    python_requires=">=3.8",
    extras_require={
        "dev": [
            "pytest>=7.0",
        ],
    },
)