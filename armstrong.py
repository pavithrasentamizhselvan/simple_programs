print"Armstrong number"
r=input("\n Enter number to find armstrong")
sum=0
while(r<0):
	n=n%10;
	sum=sum+n*n*n;
	n=n/10;
if(sum==r):
    print("\n Armstrong")
else:
    print("\n Not armstrong")