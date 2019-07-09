from tkinter import *
# THIS IS A SINGLE LINE COMMENT
'''
This is a multiline comment
'''

test = 8


def divide(num):
    global test
    test = 9
    if test == 9:
        test = 5
    else:
        test = 1


boton7 = Button(test, text="7", width=3, command=lambda: test("7"))
