numero = int(input("Digite um número: "))
quadrado = numero ** 2
print(f"O quadrado de {numero} é {quadrado}.")
# Lê o primeiro caractere
caractere1 = input("Digite o primeiro caractere: ")

# Lê o segundo caractere
caractere2 = input("Digite o segundo caractere: ")

# Exibe os caracteres na tela
print(f"O usuário digitou '{caractere1}' e '{caractere2}'!")
numero = int(input("Digite um número inteiro: "))

antecessor = numero - 1
sucessor = numero + 1

print("O antecessor de", numero, "é", antecessor)
print("O sucessor de", numero, "é", sucessor)
base = float(input("Digite a base do retângulo: "))
altura = float(input("Digite a altura do retângulo: "))

# Cálculo do perímetro
perimetro = 2 * (base + altura)

# Cálculo da área
area = base * altura

print("O perímetro do retângulo é:", perimetro)
print("A área do retângulo é:", area)

texto = "oi"
texto2 = str("oi")
numero = 3
numero2 = int(3)
numero3 = 3.0
numero4 = float(3)
print(texto)
print(texto2)
print(numero)
print(numero2)
print(numero3)
print(numero4)

val_Feijão = float(input("Qual é o valor do kilo de feijão? "))
qtd_Feijao = int(input("Quantos pacotes de feijão? "))
tot_Feijao = val_Feijão * qtd_Feijao
print("O valor total dos feijões: ",  tot_Feijao)