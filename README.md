<img align="left" width="80" height="80" src="img/Pol.png">

# PolyBot

> Pràctica de Python i Compilació de Llenguatges de programació (edició tardor 2020).

## Table of Contents

* [About The Project](#abouttheproject)
    * [Built With](#builtwith)
* [Getting Started](#gettingstarted)
    * [Prerequisites](#prerequisites)
    * [Installation](#installation)
* [Usage](#usage)
* [Bot Interaction](#botinteraction)
* [References](#references)
* [Author Info](#author-info)


## About The Project

Aqui se escribe algo

### Built With

Aquest projecte s'ha realitzat amb:

* [Python](https://www.python.org/)
* [ANTLR4](https://www.antlr.org/)
* [Telegram bot](https://core.telegram.org/bots)
* [Pillow](https://pillow.readthedocs.io/en/stable/)

## Getting Started

Aquestes instruccions us proporcionaran una còpia del projecte en funcionament a la vostra màquina local amb finalitats de desenvolupament i proves. A continuació s'especifiquen les instruccions per interactuar amb el projecte i el bot de Telegram.

### Prerequisites

Abans de tot per al bon funcionament del projecte es requereix:

* Python3
* Altres requeriments:

```sh
pip3 install -r requeriments.txt
```
_En cas de no funcionar, utilitzar `pip` en comptes de `pip3`_

### Installation

Un cop complerts els prerequisits cal obtenir el _token_ per al funcionament del bot.

1. Instalar i configurar [Telegram](https://telegram.org/).
2. Visitar el [@BotFather](https://telegram.me/botfather).
3. Utilitzar la comanda `/newbot` i proporcionar la informació requerida per a l'obtenció del _token_. 

Còpia el _token_ i enganxa'l al arxiu `token.txt` que es troba en la carpeta bot.

A partir d'aquí ja es pot interactuar amb el bot.

**Nota:** Les instruccions completes són a https://core.telegram.org/bots#6-botfather.

## Usage

Per compilar i executar la implementació de la part de compiladors s'ha de fer el següent:

* Dins de la carpeta **cl**, compilar la gramàtica Polygons.g.

```sh
antlr4 -Dlanguage=Python3 -no-listener -visitor Polygons.g
```

Un cop realitzat la compilació podrem testejar la gramàtica amb certs inputs a partir del script `TestScript.py`.

```sh
cat input.txt | python3 TestScript.py
```
 or
```sh
python3 TestScript.py < input.txt
```

**Nota:** _Es proporcionan dos arxius exemples d'entrada, `input.txt` i `example.txt`_