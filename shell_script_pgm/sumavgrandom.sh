sum=0

for (( i=1;i<=5;i++ ))
do
	randomno=$((RANDOM%100));
	if [ $randomno -ge 10 ]
	then
	    sum=$(($sum+$randomno))
            echo $sum
	fi
done

echo $sum
avg=$(($sum/5))
echo $avg

	
	
