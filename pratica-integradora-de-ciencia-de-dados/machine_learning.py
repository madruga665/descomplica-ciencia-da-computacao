import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB

data = pd.read_csv("/home/madruga665/Projetos/descomplica-ciencia-da-computacao/wine_dataset.csv")
arq = data.head()
print(f"arquivo: {arq}")

y = data["style"]
x = data.drop("style", axis=1)
x_treino, x_teste, y_treino, y_teste = train_test_split(x,y,test_size=0.3, random_state=62)
modelo = GaussianNB()
modelo.fit(x_treino, y_treino)

res = modelo.score(x_teste, y_teste)
print(res)

real = y_teste[300:307]
print(real)

pre = modelo.predict((x_teste[300:307]))
print(pre)