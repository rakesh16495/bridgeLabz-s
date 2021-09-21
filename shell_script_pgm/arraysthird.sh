#!/bin/bash

counter=0

fruits[ ((counter++)) ]="Appale"
fruits[ ((counter++)) ]="Banana"
fruits[ ((counter++)) ]="Orange"

echo "${fruits[@]}"