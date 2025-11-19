import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.datasets import load_breast_cancer
from sklearn.preprocessing import StandardScaler
from sklearn.decomposition import PCA

cancer = load_breast_cancer()
df = pd.DataFrame(cancer['data'], columns = cancer['feature_names'])
ahead = df.head()

print(ahead)
print(f'dimensões: {df.shape}')

#padronização dos dados
escalar = StandardScaler()

# treinamento
escalar.fit(df)
dados_escalados = escalar.transform(df)
print(f'dados_escalados: {dados_escalados}')
pca = PCA(n_components = 2)
pca.fit(dados_escalados)
x_pca = pca.transform(dados_escalados)
print(x_pca.shape)

plt.figure(figsize =(8, 6))
plt.scatter(x_pca[:, 0], x_pca[:, 1], c = cancer['target'], cmap = 'plasma')
plt.xlabel('Primeiro Componente Principal')
plt.ylabel('Segundo Componente Principal')
plt.show()