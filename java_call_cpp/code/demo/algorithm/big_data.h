#pragma once

struct BigElement {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;
	double r7;
	double r8;
	double r9;
	double r10;
	double r11;
	double r12;
	double r13;
	double r14;
	double r15;
	double r16;
	double r17;
	double r18;
	double r19;
	double r20;
	double r21;
	double r22;
	double r23;
	double r24;
	double r25;
	double r26;
	double r27;
	double r28;
	double r29;
	double r30;
	double count[200];
};

struct BigNode {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;
	double r7;
	double r8;
	double r9;
	double r10;
	double r11;
	double r12;
	double r13;
	double r14;
	double r15;
	double r16;
	double r17;
	double r18;
	double r19;
	double r20;
	double r21;
	double r22;
	double r23;
	double r24;
	double r25;
	double r26;
	double r27;
	double r28;
	double r29;
	double r30;
	double count[200];
	BigElement element[200];
};

struct BigData {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;
	double r7;
	double r8;
	double r9;
	double r10;
	double r11;
	double r12;
	double r13;
	double r14;
	double r15;
	double r16;
	double r17;
	double r18;
	double r19;
	double r20;
	double r21;
	double r22;
	double r23;
	double r24;
	double r25;
	double r26;
	double r27;
	double r28;
	double r29;
	double r30;
	double count[200];
	BigNode node[200];
};

typedef struct Example15StructA {
	int val;
} Example15StructA;

typedef struct Example15StructB {
	int numAs;
	Example15StructA* as;
} Example15StructB;

struct BigElementEx {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;
	double r7;
	double r8;
	double r9;
	double r10;
	double r11;
	double r12;
	double r13;
	double r14;
	double r15;
	double r16;
	double r17;
	double r18;
	double r19;
	double r20;
	double r21;
	double r22;
	double r23;
	double r24;
	double r25;
	double r26;
	double r27;
	double r28;
	double r29;
	double r30;
	double count[200];
};

struct BigNodeEx {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;
	double r7;
	double r8;
	double r9;
	double r10;
	double r11;
	double r12;
	double r13;
	double r14;
	double r15;
	double r16;
	double r17;
	double r18;
	double r19;
	double r20;
	double r21;
	double r22;
	double r23;
	double r24;
	double r25;
	double r26;
	double r27;
	double r28;
	double r29;
	double r30;
	double count[200];
	BigElementEx *element;
};

struct BigDataEx {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;
	double r7;
	double r8;
	double r9;
	double r10;
	double r11;
	double r12;
	double r13;
	double r14;
	double r15;
	double r16;
	double r17;
	double r18;
	double r19;
	double r20;
	double r21;
	double r22;
	double r23;
	double r24;
	double r25;
	double r26;
	double r27;
	double r28;
	double r29;
	double r30;
	double count[200];
	BigNodeEx *node;
};


typedef struct Example17StructA {
	int numVals;
	char** vals;
} Example17StructA;

typedef struct Example17StructB {
	int numVals;
	Example17StructA* vals;
} Example17StructB;
