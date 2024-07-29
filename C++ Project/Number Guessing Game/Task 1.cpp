#include <iostream>
#include <cstdlib>
#include <ctime>

void playGame() {

    std::srand(static_cast<unsigned int>(std::time(nullptr)));

    int tragetNumber = std::rand() % 100 + 1;
    int guess =0;
    int attempts =0;

    std::cout << "Welcome to the Number Guessing Game!" << std::endl;
    std::cout << "You have selected a number beetween 1 to 100." << std::endl;

    while (guess != tragetNumber) {
        std::cout << "Enter your guess number: ";
        std::cin >> guess;
        attempts++;

        if(guess > tragetNumber) {
            std::cout << "Too high! Try again." << std::endl;
        } else if (guess < tragetNumber) {
            std::cout << "Too low! Try again." << std::endl;
        } else {
            std::cout << "Congratulations! You've guessed the number in " << attempts << " attempts." << std::endl;
        }
    }
}

int main() {
    char playAgain = 'y';

    while (playAgain == 'y' || playAgain == 'Y') 
    {
        playGame();
        std::cout << "Do you want to play again? (y/n): ";
        std::cin >> playAgain;
    }

    std::cout << " Thank you for playing! Goodbye!" << std::endl;
    return 0;
}