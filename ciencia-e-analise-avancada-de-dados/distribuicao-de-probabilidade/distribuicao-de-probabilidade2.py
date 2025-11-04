# 1. Importar as bibliotecas necessárias
import numpy as np
from scipy.stats import randint # Usamos 'randint' do SciPy para a distribuição

# ---
# MÉTODO 1: SIMULAÇÃO RÁPIDA COM NUMPY
# ---

print("--- Método 1: Simulação com NumPy ---")

# 2. Definir os parâmetros da simulação
total_de_lancamentos = 1000000

# 3. Gerar TODOS os lançamentos de uma vez
# np.random.randint(low, high, size)
# 'low' é 1 (inclusivo)
# 'high' é 7 (porque é exclusivo, ou seja, vai até 6)
# 'size' é o número de lançamentos que queremos
lancamentos = np.random.randint(low=1, high=7, size=total_de_lancamentos)

# --- Documentação da Contagem ---
# 4. Contar os sucessos (4 ou 6) de forma vetorizada
# (lancamentos == 4) cria um array de True/False
# (lancamentos == 6) cria outro array de True/False
# O operador | (OU bitwise) combina os dois
# np.sum() soma os arrays booleanos (True=1, False=0)
# --- Fim da Documentação ---
sucessos_4 = (lancamentos == 4)
sucessos_6 = (lancamentos == 6)
total_de_sucessos = np.sum(sucessos_4 | sucessos_6)

# 5. Calcular a probabilidade experimental
probabilidade_numpy = total_de_sucessos / total_de_lancamentos

# 6. Exibir resultados do NumPy
print(f"Total de lançamentos simulados: {total_de_lancamentos}")
print(f"Total de sucessos (4 ou 6): {total_de_sucessos}")
print(f"Probabilidade (NumPy Simulação): {probabilidade_numpy:.6f}")


# ---
# MÉTODO 2: CÁLCULO TEÓRICO COM SCIPY
# ---

print("\n--- Método 2: Cálculo Teórico com SciPy.Stats ---")

# 7. Definir o modelo do dado
# Criamos uma "variável aleatória" que representa
# um dado de 6 lados. Usamos (low=1, high=7)
# para representar os resultados possíveis [1, 2, 3, 4, 5, 6].
dado_honesto = randint(low=1, high=7)

# --- Documentação do PMF ---
# 8. Calcular a probabilidade de cada evento
# Usamos o .pmf() (Probability Mass Function)
# Esta função dá-nos a probabilidade exata de um
# único resultado discreto.
# --- Fim da Documentação ---
prob_de_4 = dado_honesto.pmf(4)
prob_de_6 = dado_honesto.pmf(6)

# 9. Somar as probabilidades (P(4) + P(6))
# Como os eventos são mutuamente exclusivos,
# podemos simplesmente somá-los.
probabilidade_scipy = prob_de_4 + prob_de_6

# 10. Exibir resultados do SciPy
print(f"Probabilidade teórica de sair 4: {prob_de_4:.6f}")
print(f"Probabilidade teórica de sair 6: {prob_de_6:.6f}")
print(f"Probabilidade Teórica (SciPy): {probabilidade_scipy:.6f}")

print("\n--- Comparação ---")
print(f"Valor teórico (1/3): {1/3:.6f}")
print(f"Resultado da Simulação: {probabilidade_numpy:.6f}")
print(f"Resultado do Cálculo:   {probabilidade_scipy:.6f}")