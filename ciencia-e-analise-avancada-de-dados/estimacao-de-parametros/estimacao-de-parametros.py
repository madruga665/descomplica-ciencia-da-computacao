import scipy.stats as st
import math

nivel_de_confiancia = 0.95
nivel_de_significancia = 1 - nivel_de_confiancia

Z = abs(st.norm.ppf(nivel_de_significancia / 2))
print(f'Z={Z}')

tamanho_populacao = 60
desvio_padrao = 0.020
desvio_padrao_amostral=desvio_padrao/math.sqrt(tamanho_populacao)
media_amostral = 0.01
lim_sup = media_amostral + Z*desvio_padrao_amostral
lim_inf = media_amostral - Z*desvio_padrao_amostral
intervalo_de_confianca = (media_amostral-lim_inf, media_amostral+lim_sup)

print(f'intervalo de confianca={intervalo_de_confianca}')