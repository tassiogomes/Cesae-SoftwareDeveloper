<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Worten</title>
    <!-- FAV ICON -->
    <link rel="shortcut icon" href="img/favicon/favicon_worten.svg" type="image/x-icon">
    <!-- GOOGLE FONTES OPEN SANS-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
    
    <!-- BOOTSTRAP CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    <!--link rel="stylesheet" href="css/bootstrap.min.css"-->
    <!-- BOOTSTRAP ICONS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <!-- MEU CSS -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header class="container-fluid text-center">
        <img src="img/logo.png" alt="">
        <nav class="navbar navbar-expand-lg" data-bs-theme="dark">
            <div class="container-fluid">
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link" href="index.html">Página inicial</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="sobrenos.html">Quem somos</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="produtos.html">Produtos</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="promocoes.html">Promoções</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="contacto.html">Contacto</a>
                  </li>
                </ul>
                <form class="d-flex" role="search">
                  <input class="form-control me-2" type="search" placeholder="Pesquisar" aria-label="Pesquisar">
                  <button class="btn " type="submit">Pesquisar</button>
                </form>
              </div>
            </div>
          </nav>

    </header>
    <main class="container shadow mb-3 rounded">
        <div class="row p-4">
            <div class="col-12 col-md-6 col-lg-4">
            <div class="card mb-3 mx-auto" style="width: 18rem;"> <!-- margim bottom 3 e mx-auto centra automaticamentr-->
                <img src="img/produtos/mala_ferramentas.webp" class="card-img-top p-3" alt="mala_ferramentas">
                <div class="card-body">
                  <h5 class="card-title">Mala de ferramentas<span class="badge">NOVO!</span></h5>
                  <p class="card-text">65€</p>
                  <!-- <a href="#" class="btn btn-primary">Add to cart</a>-->
                  <button type="button" class="btn btn-primary" id="liveToastBtn">Adicionar ao carrinho</button>

                  <!-- TOAST-->
                  
                        <div class="toast-container position-fixed bottom-0 end-0 p-3">
                        <div id="liveToast" class="toast" role="alert" aria-live="assertive" aria-atomic="true">
                            <div class="toast-header">
                            <img src="..." class="rounded me-2" alt="...">
                            <strong class="me-auto">Bootstrap</strong>
                            <small>11 mins ago</small>
                            <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button>
                            </div>
                            <div class="toast-body">
                            Hello, world! This is a toast message.
                            </div>
                        </div>
                        </div>


                </div>
                </div>
              </div>
              <div class="col-12 col-md-6 col-lg-4">
                <div class="card mb-3 mx-auto" style="width: 18rem;">
                    <img src="img/produtos/bancada_trabalho.webp" class="card-img-top p-3" alt="bancada_trabalho">
                    <div class="card-body">
                      <h5 class="card-title">Bancada de trabalho</h5>
                      <p class="card-text">65€</p>
                      <a href="#" class="btn btn-primary">Add to cart</a>
                    </div>
                    </div>
                  </div>
            <div class="col-12 col-md-6 col-lg-4">
                <div class="card mb-3 mx-auto" style="width: 18rem;">
                    <img src="img/produtos/discos_rebarbadora.webp" class="card-img-top p-3" alt="discos_rebarbadora">
                    <div class="card-body">
                      <h5 class="card-title">Disco Rebarbadora</h5>
                      <p class="card-text">5€</p>
                      <a href="#" class="btn btn-primary">Add to cart</a>
                    </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="card mb-3 mx-auto" style="width: 18rem;">
                        <img src="img/produtos/bancada_trabalho.webp" class="card-img-top p-3" alt="bancada_trabalho">
                        <div class="card-body">
                          <h5 class="card-title">Bancada de trabalho</h5>
                          <p class="card-text">65€</p>
                          <a href="#" class="btn btn-primary">Add to cart</a>
                        </div>
                        </div>
                      </div>
                      <div class="col-12 col-md-6 col-lg-4">
                        <div class="card mb-3 mx-auto" style="width: 18rem;">
                            <img src="img/produtos/bancada_trabalho.webp" class="card-img-top p-3" alt="bancada_trabalho">
                            <div class="card-body">
                              <h5 class="card-title">Bancada de trabalho</h5>
                              <p class="card-text">65€</p>
                              <a href="#" class="btn btn-primary">Add to cart</a>
                            </div>
                            </div>
                          </div>
                          <div class="col-12 col-md-6 col-lg-4">
                            <div class="card mb-3 mx-auto" style="width: 18rem;">
                                <img src="img/produtos/bancada_trabalho.webp" class="card-img-top p-3" alt="bancada_trabalho">
                                <div class="card-body">
                                  <h5 class="card-title">Bancada de trabalho</h5>
                                  <p class="card-text">65€</p>
                                  <a href="#" class="btn btn-primary">Add to cart</a>
                                </div>
                                </div>
                              </div>                     
            </div>
        CONTEUDO
    </main>
    <footer class="container-fluid">
      <div class="row">
        <div class="col-12 col-md-6 text-center p-3">
        © WORTEN - EQUIPAMENTOS PARA O LAR, S.A
        </div>
        <div class="col-12 col-md-6 text-center p-3">
          <a href="https://www.facebook.com/wortenpt/" target="_blank"><i class="bi bi-facebook"></i></a>
          <a href="https://twitter.com/WortenPT" target="_blank"><i class="bi bi-twitter"></i></a>
          <a href="https://www.instagram.com/wortenpt/?hl=pt" target="_blank"><i class="bi bi-instagram"></i></a>
          <a href="https://www.linkedin.com/company/worten/" target="_blank"><i class="bi bi-linkedin"></i></a>
          <a href="https://www.twitch.tv/wortenpt" target="_blank"><i class="bi bi-twitch"></i></a>
          <a href="https://www.youtube.com/c/worten" target="_blank"><i class="bi bi-youtube"></i></a>
        </div>
      </div>
    </div>
    </footer>
    <!-- BOOTSTRAP JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
    <!--script src="js/bootstrap.bundle.min.js"></!--script-->
    <script src="js/main.js"></script>
</body>
</html>