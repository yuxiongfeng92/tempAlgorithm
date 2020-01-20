#pragma once
#include <vector>
using namespace std;

struct TempImg {
	//int takeDown;
	bool handle;
	int startInd;
	int stickN;
	int decline;
	int predInd;
	int firstStart;
	int status;
	float stabT;
	float predTemp;
};

vector<float> riseCurve(vector<float> data, float pred, int startInd);
TempImg getTemp(vector<float> data, float preVal, float predTemp, int startInd,int predInd, int stickN, int decline,bool handle,int firstStart);
