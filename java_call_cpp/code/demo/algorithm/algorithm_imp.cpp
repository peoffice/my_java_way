#include"stdafx.h"
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include"algorithm.h"

void test_free(void *pointer) {
	if (pointer != NULL)
	{
		printf("free memory...\n");
		free(pointer);
	}
}
char* test_string_input_return_value(const char *input, int length) {
	printf("input=%s\n", input);
	int size = sizeof(char)*(length + 1);
	printf("size=%d\n", size);
	char *output = (char*)malloc(size);
	memset(output, 0, size);
	strcpy(output, input);
	printf("output=%s\n", output);
	return output;
}

int test_string_input_output(const char *input, int length,char **output) {
	printf("input=%s\n", input);
	int size = sizeof(char)*(length + 1);
	printf("size=%d\n", size);
	*output = (char*)malloc(size);
	memset(*output, 0, size);
	strcpy(*output, input);
	printf("output=%s\n", *output);
	return 100;
}
MyResult test_structure_input_output(const MyPara* para) {
	MyResult result;

	printf("enter test_structure_input_output\n");

	printf("para:r1 = %.20lf\n", para->r1);
	printf("para:r2 = %.20lf\n", para->r2);
	printf("para:r3 = %.20lf\n", para->r3);
	printf("para:r4 = %.20lf\n", para->r4);
	printf("para:r5 = %.20lf\n", para->r5);
	printf("para:r6 = %.20lf\n", para->r6);

	printf("para:L:r1 = %.20lf\n", para->L.r1);
	printf("para:L:r2 = %.20lf\n", para->L.r2);
	printf("para:L:r3 = %.20lf\n", para->L.r3);
	printf("para:L:r4 = %.20lf\n", para->L.r4);
	printf("para:L:r5 = %.20lf\n", para->L.r5);
	printf("para:L:r6 = %.20lf\n", para->L.r6);


	printf("para:L:L8:r1 = %.20lf\n", para->L.L8.r1);
	printf("para:L:L8:r2 = %.20lf\n", para->L.L8.r2);
	printf("para:L:L8:r3 = %.20lf\n", para->L.L8.r3);
	printf("para:L:L8:r4 = %.20lf\n", para->L.L8.r4);
	printf("para:L:L8:r5 = %.20lf\n", para->L.L8.r5);
	printf("para:L:L8:r6 = %.20lf\n", para->L.L8.r6);

	printf("para:L:L8:L7:r1 = %.20lf\n", para->L.L8.L7.r1);
	printf("para:L:L8:L7:r2 = %.20lf\n", para->L.L8.L7.r2);
	printf("para:L:L8:L7:r3 = %.20lf\n", para->L.L8.L7.r3);
	printf("para:L:L8:L7:r4 = %.20lf\n", para->L.L8.L7.r4);
	printf("para:L:L8:L7:r5 = %.20lf\n", para->L.L8.L7.r5);
	printf("para:L:L8:L7:r6 = %.20lf\n", para->L.L8.L7.r6);

	printf("para:L:L8:L7:L6:r1 = %.20lf\n", para->L.L8.L7.L6.r1);
	printf("para:L:L8:L7:L6:r2 = %.20lf\n", para->L.L8.L7.L6.r2);
	printf("para:L:L8:L7:L6:r3 = %.20lf\n", para->L.L8.L7.L6.r3);
	printf("para:L:L8:L7:L6:r4 = %.20lf\n", para->L.L8.L7.L6.r4);
	printf("para:L:L8:L7:L6:r5 = %.20lf\n", para->L.L8.L7.L6.r5);
	printf("para:L:L8:L7:L6:r6 = %.20lf\n", para->L.L8.L7.L6.r6);

	printf("para:L:L8:L7:L6:L5:r1 = %.20lf\n", para->L.L8.L7.L6.L5.r1);
	printf("para:L:L8:L7:L6:L5:r2 = %.20lf\n", para->L.L8.L7.L6.L5.r2);
	printf("para:L:L8:L7:L6:L5:r3 = %.20lf\n", para->L.L8.L7.L6.L5.r3);
	printf("para:L:L8:L7:L6:L5:r4 = %.20lf\n", para->L.L8.L7.L6.L5.r4);
	printf("para:L:L8:L7:L6:L5:r5 = %.20lf\n", para->L.L8.L7.L6.L5.r5);
	printf("para:L:L8:L7:L6:L5:r6 = %.20lf\n", para->L.L8.L7.L6.L5.r6);

	printf("para:L:L8:L7:L6:L5:L4:r1 = %.20lf\n", para->L.L8.L7.L6.L5.L4.r1);
	printf("para:L:L8:L7:L6:L5:L4:r2 = %.20lf\n", para->L.L8.L7.L6.L5.L4.r2);
	printf("para:L:L8:L7:L6:L5:L4:r3 = %.20lf\n", para->L.L8.L7.L6.L5.L4.r3);
	printf("para:L:L8:L7:L6:L5:L4:r4 = %.20lf\n", para->L.L8.L7.L6.L5.L4.r4);
	printf("para:L:L8:L7:L6:L5:L4:r5 = %.20lf\n", para->L.L8.L7.L6.L5.L4.r5);
	printf("para:L:L8:L7:L6:L5:L4:r6 = %.20lf\n", para->L.L8.L7.L6.L5.L4.r6);

	printf("para:L:L8:L7:L6:L5:L4:L3:r1 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.r1);
	printf("para:L:L8:L7:L6:L5:L4:L3:r2 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.r2);
	printf("para:L:L8:L7:L6:L5:L4:L3:r3 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.r3);
	printf("para:L:L8:L7:L6:L5:L4:L3:r4 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.r4);
	printf("para:L:L8:L7:L6:L5:L4:L3:r5 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.r5);
	printf("para:L:L8:L7:L6:L5:L4:L3:r6 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.r6);

	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r1 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.r1);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r2 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.r2);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r3 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.r3);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r4 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.r4);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r5 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.r5);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r6 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.r6);

	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r1 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.L1.r1);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r2 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.L1.r2);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r3 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.L1.r3);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r4 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.L1.r4);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r5 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.L1.r5);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r6 = %.20lf\n", para->L.L8.L7.L6.L5.L4.L3.L2.L1.r6);

	result.r = -1.0;
	result.r0 = 0.0;
	result.r1 = 1.0;
	result.r2 = 2.0;
	result.r3 = 3.0;
	result.r4 = 4.0;
	result.r5 = 5.0;
	result.r6 = 6.0;
	result.r7 = 7.0;
	result.r8 = 8.0;
	
	printf("leave test_structure_input_output\n");
	
	return result;
}
MyResult test_structure_nonpointer_input_output(MyPara para) {
	MyResult result;

	printf("enter test_structure_nonpointer_input_output\n");

	printf("para:r1 = %.20lf\n", para.r1);
	printf("para:r2 = %.20lf\n", para.r2);
	printf("para:r3 = %.20lf\n", para.r3);
	printf("para:r4 = %.20lf\n", para.r4);
	printf("para:r5 = %.20lf\n", para.r5);
	printf("para:r6 = %.20lf\n", para.r6);

	printf("para:L:r1 = %.20lf\n", para.L.r1);
	printf("para:L:r2 = %.20lf\n", para.L.r2);
	printf("para:L:r3 = %.20lf\n", para.L.r3);
	printf("para:L:r4 = %.20lf\n", para.L.r4);
	printf("para:L:r5 = %.20lf\n", para.L.r5);
	printf("para:L:r6 = %.20lf\n", para.L.r6);


	printf("para:L:L8:r1 = %.20lf\n", para.L.L8.r1);
	printf("para:L:L8:r2 = %.20lf\n", para.L.L8.r2);
	printf("para:L:L8:r3 = %.20lf\n", para.L.L8.r3);
	printf("para:L:L8:r4 = %.20lf\n", para.L.L8.r4);
	printf("para:L:L8:r5 = %.20lf\n", para.L.L8.r5);
	printf("para:L:L8:r6 = %.20lf\n", para.L.L8.r6);

	printf("para:L:L8:L7:r1 = %.20lf\n", para.L.L8.L7.r1);
	printf("para:L:L8:L7:r2 = %.20lf\n", para.L.L8.L7.r2);
	printf("para:L:L8:L7:r3 = %.20lf\n", para.L.L8.L7.r3);
	printf("para:L:L8:L7:r4 = %.20lf\n", para.L.L8.L7.r4);
	printf("para:L:L8:L7:r5 = %.20lf\n", para.L.L8.L7.r5);
	printf("para:L:L8:L7:r6 = %.20lf\n", para.L.L8.L7.r6);

	printf("para:L:L8:L7:L6:r1 = %.20lf\n", para.L.L8.L7.L6.r1);
	printf("para:L:L8:L7:L6:r2 = %.20lf\n", para.L.L8.L7.L6.r2);
	printf("para:L:L8:L7:L6:r3 = %.20lf\n", para.L.L8.L7.L6.r3);
	printf("para:L:L8:L7:L6:r4 = %.20lf\n", para.L.L8.L7.L6.r4);
	printf("para:L:L8:L7:L6:r5 = %.20lf\n", para.L.L8.L7.L6.r5);
	printf("para:L:L8:L7:L6:r6 = %.20lf\n", para.L.L8.L7.L6.r6);

	printf("para:L:L8:L7:L6:L5:r1 = %.20lf\n", para.L.L8.L7.L6.L5.r1);
	printf("para:L:L8:L7:L6:L5:r2 = %.20lf\n", para.L.L8.L7.L6.L5.r2);
	printf("para:L:L8:L7:L6:L5:r3 = %.20lf\n", para.L.L8.L7.L6.L5.r3);
	printf("para:L:L8:L7:L6:L5:r4 = %.20lf\n", para.L.L8.L7.L6.L5.r4);
	printf("para:L:L8:L7:L6:L5:r5 = %.20lf\n", para.L.L8.L7.L6.L5.r5);
	printf("para:L:L8:L7:L6:L5:r6 = %.20lf\n", para.L.L8.L7.L6.L5.r6);

	printf("para:L:L8:L7:L6:L5:L4:r1 = %.20lf\n", para.L.L8.L7.L6.L5.L4.r1);
	printf("para:L:L8:L7:L6:L5:L4:r2 = %.20lf\n", para.L.L8.L7.L6.L5.L4.r2);
	printf("para:L:L8:L7:L6:L5:L4:r3 = %.20lf\n", para.L.L8.L7.L6.L5.L4.r3);
	printf("para:L:L8:L7:L6:L5:L4:r4 = %.20lf\n", para.L.L8.L7.L6.L5.L4.r4);
	printf("para:L:L8:L7:L6:L5:L4:r5 = %.20lf\n", para.L.L8.L7.L6.L5.L4.r5);
	printf("para:L:L8:L7:L6:L5:L4:r6 = %.20lf\n", para.L.L8.L7.L6.L5.L4.r6);

	printf("para:L:L8:L7:L6:L5:L4:L3:r1 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.r1);
	printf("para:L:L8:L7:L6:L5:L4:L3:r2 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.r2);
	printf("para:L:L8:L7:L6:L5:L4:L3:r3 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.r3);
	printf("para:L:L8:L7:L6:L5:L4:L3:r4 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.r4);
	printf("para:L:L8:L7:L6:L5:L4:L3:r5 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.r5);
	printf("para:L:L8:L7:L6:L5:L4:L3:r6 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.r6);

	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r1 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.r1);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r2 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.r2);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r3 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.r3);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r4 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.r4);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r5 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.r5);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:r6 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.r6);

	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r1 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.L1.r1);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r2 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.L1.r2);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r3 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.L1.r3);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r4 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.L1.r4);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r5 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.L1.r5);
	printf("para:L:L8:L7:L6:L5:L4:L3:L2:L1:r6 = %.20lf\n", para.L.L8.L7.L6.L5.L4.L3.L2.L1.r6);

	result.r = -1.0;
	result.r0 = 0.0;
	result.r1 = 1.0;
	result.r2 = 2.0;
	result.r3 = 3.0;
	result.r4 = 4.0;
	result.r5 = 5.0;
	result.r6 = 6.0;
	result.r7 = 7.0;
	result.r8 = 8.0;

	printf("leave test_structure_nonpointer_input_output\n");

	return result;
}

int test_big_data_transfor(const BigData* data) {
	printf("enter test_big_data_transfor\n");
	printf("data->r1=%lf\n", data->r1);
	printf("data->node[0].r1=%lf\n", data->node[0].r1);
	printf("data->node[0].element[0].r1=%lf\n", data->node[0].element[0].r1);
	printf("data->node[0].element[0].count[0]=%lf\n", data->node[0].element[0].count[0]);
	printf("leave test_big_data_transfor\n");
	return 100;
}
int test_big_data_transfor_ex(const BigDataEx *data) {
	printf("enter test_big_data_transfor\n");
	printf("data->r1=%lf\n", data->r1);
	printf("data->node[0].r1=%lf\n", data->node[0].r1);
	printf("data->node[0].element[0].r1=%lf\n", data->node[0].element[0].r1);
	printf("data->node[0].element[0].count[0]=%lf\n", data->node[0].element[0].count[0]);
	printf("leave test_big_data_transfor\n");
	return 100;
}
void example15_send(const Example15StructB* pVal)
{
	int loop = 0;
	printf("(C) Example 15: %d values\n", pVal->numAs);
	for (loop = 0; loop<pVal->numAs; loop++)
	{
		printf("\t(C): %d\n", pVal->as[loop].val);
	}
}

void example23_sendDoublePtr(double* pVal)
{
	printf("(C) Example 23: %f\n", *pVal);
	(*pVal) = 10000.0;
	printf("(C) Example 23: %f\n", *pVal);
}

void example17_sendMultidimensionalArray(const Example17StructB* pVal)
{
	int loop1 = 0;
	int loop2 = 0;
	printf("(C) Example 17: received %d outer array values\n", pVal->numVals);
	for (loop1 = 0; loop1<pVal->numVals; loop1++)
	{
		printf("\t(C) outer array %d contains %d inner items\n", loop1, pVal->vals[loop1].numVals);
		for (loop2 = 0; loop2<pVal->vals[loop1].numVals; loop2++)
		{
			printf("\t\t(C)  item [%d][%d]: %s\n", loop1, loop2, pVal->vals[loop1].vals[loop2]);
		}
	}
}

void example22_triggerCallback(const Example22Callback pfn,int target)
{
	(*pfn)(target);
}