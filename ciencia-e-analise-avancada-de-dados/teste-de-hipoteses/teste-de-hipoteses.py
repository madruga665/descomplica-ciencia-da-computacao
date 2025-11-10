import numpy as np
import matplotlib.pyplot as plt

# Geração de dados da população
tamanho_populacao = 10000
np.random.seed(2000)
lst_dados = []

for i in range(2):
    dados = np.random.normal(loc=100, scale=10, size=tamanho_populacao)

plt.hist(dados);
plt.xlabel("Categorias");
plt.ylabel("Quantidade");
plt.hist(x=dados, bins="auto", color="#0805aa", alpha=0.7,rwidth=0.85, density=True)
plt.grid(axis="y", alpha=0.80)
plt.xlabel("Categorias")
plt.ylabel("Quantidades")
plt.title("Histograma das Amostras")
lst_dados.append(dados)
plt.show()