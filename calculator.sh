#!/bin/bash
echo "Simple Calculator"
echo "Do you want to perform a calculation? (yes/no)"
read choice
if [ "$choice" != "yes" ]; then
    echo "Exiting calculator..."
    exit 0
fi

echo -n  "Enter first number:"
read a
echo -n "Enter second number:"
read b
echo -n "Enter operation (+, -, *, /):"
read op

case $op in
  +) result=$((a + b));;
  -) result=$((a - b));;
  \*) result=$((a * b));;
  /) 
    if [ "$b" -eq 0 ]; then
      echo "Error: Division by zero is not allowed."
      exit 1
    else
      result=$((a / b))
    fi
    ;;
  *) 
    echo "Invalid operation"
    exit 1
    ;;
esac

echo "Result: $result"
echo "Exiting calculator..."
exit 0

