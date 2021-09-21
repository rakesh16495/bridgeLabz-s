#!/bin/bash

my_funasargument()
{
	local func_result="I do my work"
	echo "$func_result"
}

 var="$(my_funasargument)"
 echo $var	