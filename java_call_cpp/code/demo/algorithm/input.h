#pragma once

struct Level_1 {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;
};
struct Level_2 {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level_1 L1;
};

struct Level_3 {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level_2 L2;
};

struct Level_4 {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level_3 L3;
};

struct Level_5 {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level_4 L4;
};

struct Level_6 {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level_5 L5;
};

struct Level_7 {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level_6 L6;
};

struct Level_8 {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level_7 L7;
};

struct Level {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level_8 L8;
};
struct MyPara {
	double r1;
	double r2;
	double r3;
	double r4;
	double r5;
	double r6;

	Level L;
};

typedef void(*Example22Callback)(int);


