import matplotlib.pyplot as plt
import numpy as np

tamanho_pupulacao = 10000
np.random.seed(2006)
dados_populacao = np.random.normal(loc=100, scale=10, size=tamanho_pupulacao)

plt.hist(dados_populacao)
plt.xlabel("Altura da àrvore")
plt.ylabel("Qtde de árvores")
plt.show()