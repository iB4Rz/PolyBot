# importa l'API de Telegram
import sys
from telegram.ext import Updater, CommandHandler
from telegram.ext import MessageHandler, Filters
from telegram import ParseMode
sys.path.append("..")
if __name__ is not None and "." in __name__:
    from cl.test_script import getVisitor
else:
    from cl.test_script import getVisitor


def start(update, context):
    context.bot.send_message(
        chat_id=update.effective_chat.id,
        text="Hi, I'm PolyBot!\n" + "Welcome " +
        update.message.chat.first_name + "!")


def help(update, context):
    msg = ''' You can interact with me using the following commands:
    - */start*: Start the conversation with me
    - */help*: Get a list of all the commands I can interact with
    - */author*: Info from my creator
    - */example*: Example of everything I can do
    *Polygon commands:*
    print, area, perimeter, vertices, centroid, color, inside,
    equal, draw, intersection, convex union, bounding box ...
    '''
    context.bot.send_message(
        chat_id=update.effective_chat.id,
        text=msg, parse_mode=ParseMode.MARKDOWN)


def author(update, context):
    context.bot.send_message(
        chat_id=update.effective_chat.id,
        text="Author: " + "Albert Ibars\n" +
        "Mail: albert.ibars.cubel@estudiantat.upc.edu")


def example(update, context):
    msg = '''Example:
    p1 := [0 0  0 1  1 1  0.2 0.8]
    color p1, {1 0 0}
    area p1
    perimeter p1
    vertices p1
    centroid p1
    print "---"
    p2 := [0 0  1 0  1 1]
    color p2, {0 1 0}
    print p2
    equal p1, p2
    inside p1, p2
    inside [0.8 0.2], p2
    draw "image.png", p1, p2
    print p1 + p2
    print p1 * p2
    print #p2
    equal p1 + p2, #p2
    p3 := #((p1 + p2) * [0 0  1 0  1 1])
    r := !100
    '''
    context.bot.send_message(
        chat_id=update.effective_chat.id,
        text=msg)


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
dispatcher.add_handler(CommandHandler('example', example))
dispatcher.add_handler(MessageHandler(Filters.text, commands))


# engega el bot
updater.start_polling()
