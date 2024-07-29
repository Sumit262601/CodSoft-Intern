import random
import string
import tkinter as tk
from tkinter import messagebox

def generate_password(length):
    characters = string.ascii_letters + string.digits + string.punctuation
    password = ''.join(random.choice(characters) for _ in range(length))
    return password

def generate():
    try:
        length = int(entry_length.get())
        if length <= 0:
            messagebox.showerror("Error", "Please enter a positive integer.")
            return
        password = generate_password(length)
        entry_password.delete(0, tk.END)
        entry_password.insert(0, password)
    except ValueError:
        messagebox.showerror("Error", "Invalid input. Please enter a number.")

# Set up the main application window
root = tk.Tk()
root.title("Password Generator")

# Increase the window size
root.geometry("600x400")

# Create and place the length label and entry
label_length = tk.Label(root, text="Enter the desired length of the password:", font=("Helvetica", 15), fg="Black")
label_length.pack(pady=15)

entry_length = tk.Entry(root, font=("Helvetica", 12), fg="black")
entry_length.pack(pady=5)

# Create and place the generate button
button_generate = tk.Button(root, text="Generate Password", command=generate, font=("Helvetica", 10), fg="white", bg="green")
button_generate.pack(pady=50)

# Create and place the password entry (to display the generated password)
entry_password = tk.Entry(root, width=50, font=("Helvetica", 12), fg="black")
entry_password.pack(pady=0)

# Allow window resizing
root.resizable(True, True)

# Run the application
root.mainloop()
