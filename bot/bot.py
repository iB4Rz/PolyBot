# importa l'API de Telegram
import sys
sys.path.append("..")
from cl.test_script import getVisitor               # noqa: E402
from telegram.ext import Updater, CommandHandler    # noqa: E402
from telegram.ext import MessageHandler, Filters    # noqa: E402


# defineix una funció que saluda i que
# s'executarà quan el bot rebi el missatge /start
def start(update, context):
    context.bot.send_message(
        chat_id=update.effective_chat.id,
        text="Hola sóc PolyBot!\n" + "Benvingut " +
        update.message.chat.first_name + " !")


def help(update, context):
    context.bot.send_message(
        chat_id=update.effective_chat.id,
        text="Soc un bot amb comandes /start, /help i /hora.")


def author(update, context):
    context.bot.send_message(
        chat_id=update.effective_chat.id,
        text="Autor: " + "Albert Ibars\n" +
        "Correu: albert.ibars.cubel@estudiantat.upc.edu")


def commands(update, context):
    text = update.message.text
    result = getVisitor(text)
    if result is not None:
        context.bot.send_message(
            chat_id=update.effective_chat.id,
            text=result)
    else:
        if text.split(' ', 1)[0] == "draw":
            img = text.split('\"', 2)[1]
            image = "{}".format(img)
            context.bot.send_photo(
                chat_id=update.message.chat_id,
                photo=open(image, 'rb'))



# declara una constant amb el access token que llegeix de token.txt
TOKEN = open('token.txt').read().strip()

# crea objectes per treballar amb Telegram
updater = Updater(token=TOKEN, use_context=True)
dispatcher = updater.dispatcher

# indica que quan el bot rebi la comanda /start s'executi la funció start
dispatcher.add_handler(CommandHandler('start', start))
dispatcher.add_handler(CommandHandler('help', help))
dispatcher.add_handler(CommandHandler('author', author))
dispatcher.add_handler(MessageHandler(Filters.text, commands))


# engega el bot
updater.start_polling()
