import groovy.transform.*
/* 
  Fast Fibonacci implementation.
  Handles negative nuumbers.
*/
@Memoized
public int fib(int a) {
  if (a < 0)
    throw new IllegalArgumentException("Number negative!")
  if ((a == 0) || (a == 1))
    return 1
  return fib(a-2)+fib(a-1)
}

// Print out last value of Fibonacci sequence for n, given by user
println fib(Integer.parseInt(args[0]))
