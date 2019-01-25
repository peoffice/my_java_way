#pragma once

#include"input.h"
#include"output.h"
#include"big_data.h"

extern "C" __declspec(dllexport) void test_free(void *pointer);
extern "C" __declspec(dllexport) int test_string_input_output(const char *input,int length, char **output);
extern "C" __declspec(dllexport) char* test_string_input_return_value(const char *input, int length);
extern "C" __declspec(dllexport) MyResult test_structure_input_output(const MyPara* para);
extern "C" __declspec(dllexport) MyResult test_structure_nonpointer_input_output(MyPara para);

extern "C" __declspec(dllexport) int test_big_data_transfor(const BigData *data);
extern "C" __declspec(dllexport) int test_big_data_transfor_ex(const BigDataEx *data);

extern "C" __declspec(dllexport) void example15_send(const Example15StructB* pVal);

extern "C" __declspec(dllexport) void example23_sendDoublePtr(double* pVal);

extern "C" __declspec(dllexport) void example17_sendMultidimensionalArray(const Example17StructB* pVal);

extern "C" __declspec(dllexport) void example22_triggerCallback(const Example22Callback pfn, int target);
