# jax-rs 3.1.5
<div>
  <p>Passos necessarios:</p>
  <ol>
    <li>
      Adicionar o postgresql:
      <ul>
        <li>Dar o pull na imagem do postgresql no docker descktop (Mais simples que por linha de comando)</li>
        <li>Adicionar as variaveis de ambiente: <code>POSTGRES_PASSWORD</code>, <code>POSTGRES_USER</code> e <code>POSTGRES_DB</code>(nome do DB)</li>
      </ul>
    </li>
    <li>Trocar os dados no jdbc.properties</li>
    <li>buildar a imagem: <code>docker build -t {nome do projeto} .</code></li>
    <li>Rodar a imagem no docker: <code>docker run {porta}(exemplo: 8080:8080) {nome da imagem} </code></li>
  </ol>
  <p>Após finalizado, só rodar em uma aplicação de teste de Api.</p>
</div>
