abc ()
{
	echo hello $1
	val = echo hello $1 | awk "{ $2="Guys" } { print $0 }"
	echo $val
	return $val
}

abc User