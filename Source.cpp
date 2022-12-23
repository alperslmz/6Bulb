#include <iostream>
using namespace std;
#define REP 50000

int main()
{
    int total = 0;
    bool bulbs[6];
    for (int j = 0; j < REP; j++) {

        for (bool bulb : bulbs) {
            bulb = false;
        }

        int counter = 0;
        bool result = false;

        while (!result) {
            int randomNum = (rand() % 6);
            bulbs[randomNum] = !bulbs[randomNum];
            result = bulbs[0] && bulbs[1] && bulbs[2] && bulbs[3] && bulbs[4] && bulbs[5];
            counter++;
        }
        total += counter;

    }
    cout << "Avg. required repeat:" << total / REP;
    return 0;
}