import numpy as np
import matplotlib.pyplot as plt


# def f(x):
#     return np.sqrt(x)


# x = np.linspace(0, 3, 400)
# y = f(x)

# plt.plot(x, y)

# plt.title("Gráfico de $f(x) = \sqrt{x}$")

# plt.xlabel("x")

# plt.ylabel("$f(x)$")

# plt.grid(True)

# plt.show()

def test(x):
    return 2*x + 3


print(test(4))

def test2(x):
    return x**3 - 3*x + 2

print(test2(-1))