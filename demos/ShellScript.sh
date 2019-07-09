#!/bin/bash
# Comment
myInt=6
myString="Hello"
IFS=$'\n'

myfunc() {
    local localVar=6
    if [ $myInt -lt 1 ]; then
        echo "This is a string $myInt $myString $localVar"
    else
        echo "Testing " >>/home/test.txt
    fi
}
