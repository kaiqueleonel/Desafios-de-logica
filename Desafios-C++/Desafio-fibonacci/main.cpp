#include <iostream>


using namespace std;

int main()
{
    int fibonacci = 1, num_anterior = 0, quant_termos = 0;
    cout << "Quantas termos da sequencia fibonacci deseja? " << endl;
    cin >> quant_termos;
    cout << "\nAqui esta a sequencia de fibonacci com " << quant_termos<< ": ";
    cout << fibonacci;
    for (int i = 0; i < quant_termos; i++){
        num_anterior = fibonacci - num_anterior;
        fibonacci = fibonacci + num_anterior;

        cout << ", " << fibonacci;
    }
    return 0;
}
