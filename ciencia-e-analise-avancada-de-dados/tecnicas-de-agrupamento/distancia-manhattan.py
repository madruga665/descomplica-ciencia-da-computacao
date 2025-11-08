import numpy as np

def manhattan_distance_numpy(p1, p2):
    """
    Calcula a distância de Manhattan entre dois pontos usando NumPy.
    Os pontos devem ser arrays NumPy.
    """
    p1_np = np.array(p1)
    p2_np = np.array(p2)
    # A norma L1 (ord=1) é a distância de Manhattan
    distance = np.linalg.norm(p1_np - p2_np, ord=1)
    return distance

# Exemplo de uso:
ponto_a = [3, 2, 0]
ponto_b = [6, 2, 4]
dist_np = manhattan_distance_numpy(ponto_a, ponto_b)
print(f"Distância de Manhattan (NumPy): {dist_np}")
