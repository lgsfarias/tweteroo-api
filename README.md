<p align="center">
  <a href="https://github.com/lgsfarias/tweteroo-api-java">
    <img src="./assets/icon.png" alt="readme-logo" width="100">
  </a>

  <h3 align="center">
    Tweetero Spring API
  </h3>
  <p align="center">
    Uma API para servir o app Tweetero. 
    <br />
    <a href="https://github.com/lgsfarias/tweteroo-api-java"><strong>Explore the docs »</strong></a>
    <br />
</p>

## 🎯 Goals

É um projeto que utiliza Java Spring Boot para criar uma API REST para um sistema de tweets, conhecido como _Tweetero_, um clone do Twitter.

Neste projeto não foi desenvolvido o front-end. Ele já estava pronto e foi disponibilizado.

</br>

## Front-end Tweteroo


<img src="./assets/banner.png" alt="Banner" >
<br/><br/>


## Requisitos

Os requisitos do projeto foram:

<details>
<summary>Geral</summary>

-   [x] A porta utilizada pelo seu servidor deve ser a 8080 (Porta padrão do Spring)
-   [x] Versionamento usando Git é obrigatório, crie um **repositório público** no seu perfil do GitHub
-   [x] Faça commits a cada funcionalidade implementada
</details>

<details>
<summary>Armazenamento de dados</summary>

-   [x] Para persistir os dados (usuários e tweets), utilize variáveis globais em memória
-   [x] O formato de um **usuário** deve ser:

```javascript
{
	username: 'bobesponja',
	avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info"
}
```

-   [x] O formato de um tweet deve ser:

```javascript
{
	username: "bobesponja",
	avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
    	text: "eu amo o hub"
}
```

</details>

<details>
<summary>POST /sign-up</summary>

-   [x] Deve receber (pelo body da request), um parâmetro username e um avatar, contendo o nome do username do usuário e a sua foto de avatar:

```javascript
{
    	username: "bobesponja",
	avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info"
}
```

-   [x] Por fim, retornar a mensagem `“OK”`
</details>

<details>
<summary>POST /tweets</summary>

-   [x] Deve receber (pelo body da request), os parâmetros `username` e `tweet`:

```javascript
{
	username: "bobesponja",
    	tweet: "eu amo o hub"
}
```

-   [x] Salvar esse tweet num array de tweets do servidor
-   [x] Por fim, retornar a mensagem `“OK”`
</details>

<details>
<summary>GET /tweets com paginação</summary>

-   [x] Retornar os 5 últimos tweets publicados
-   [x] Esse endpoint deverá receber a página identificada via query string (`?page=1`).
-   [x] Deve retornar corretamente os tweets da “página” (`page`) atual, esse endpoint também será chamado ao clicar no botão “**Carregar mais**” (isso já foi feito no front-end). A primeira página corresponde aos últimos 5 tweets, a segunda do 6 ao 10, a terceira do 11 ao 15, etc…

```javascript
[
	{
		username: "bobesponja",
		avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
		tweet: "eu amo o hub"
	}
]
```

</details>

<details>
<summary>GET /tweets/USERNAME</summary>

-   [x] Retornar todos os tweets publicados do usuario recebido por parâmetro de rota

```javascript
[
	{
		username: "bobesponja",
		avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
	    	tweet: "eu amo o hub"
	}
]
```

</details>