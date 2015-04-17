#include <stdio.h>
int main(int argc, char *argv[]) {
		int x=2, t=5; 
		int x1=3, t1=-2;
		int sumax=0, sumat=0;
			printf("Programa que suma dos polinomios.\n\n");
			printf("\t(2x + 5) + (3x - 2) ");
			sumax=x+x1;
			sumat=t+t1;
			printf("= %dx + %d \n",sumax, sumat);
	return 0;
}
