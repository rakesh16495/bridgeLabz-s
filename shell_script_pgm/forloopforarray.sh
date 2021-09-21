
array=(abc 123 free 454)

for (( i=0; i<=${#array[@]}-1; i++ ))
do
	echo ${array[i]}

done