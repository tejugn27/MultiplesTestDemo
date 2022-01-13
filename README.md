# MultiplesTestDemo

This is a simple Multiples iterator displaying multiples of A until X.

## Assumptions
```aidl
A -> an integer value +/- 
X -> an integer non-zero positive value
```


## How to run and test
The code exists in java main function, and it can be executed through any java IDE run plugin, or it can also executed 
though command line.

### Command Line
```aidl
Go to project main folder:
cd MultiplesTestDemo

// compile the code first
% javac src/com/test/MultiplesIterator.java

// run the code
% java src/com/test/MultiplesIterator.java
```


Here is the sample outout:
```aidl
% java src/com/test/MultiplesIterator.java
Enter an integer value for multiples(say A):
2
Enter an integer value that require multiples upto(say X):
5

Following is the list of multiples of '2' until '5'
2	4	6	8	10	
Following is the list of multiples of '3' until '10'
3	6	9	12	15	18	21	24	27	30	
Following is the list of multiples of '4' until '15'
4	8	12	16	20	24	28	32	36	40	44	48	52	56	60	%     
                                                                                                                
                                                                                                                
% java src/com/test/MultiplesIterator.java                                                                                            % java src/com/test/MultiplesIterator.java
Enter an integer value for multiples(say A):
-2
Enter an integer value that require multiples upto(say X):
5

Following is the list of multiples of '-2' until '5'
-2	-4	-6	-8	-10	
Following is the list of multiples of '-1' until '10'
-1	-2	-3	-4	-5	-6	-7	-8	-9	-10	
Scenario(A+2 until 3X) cannot be iterated, the multiple value returned:0
% 

```
