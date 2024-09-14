package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String olaMundo(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"pt-BR\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Exemplo de Página Fake</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            margin: 20px;\n" +
                "            line-height: 1.6;\n" +
                "        }\n" +
                "        h1, h2, h3 {\n" +
                "            color: #333;\n" +
                "        }\n" +
                "        p {\n" +
                "            color: #555;\n" +
                "        }\n" +
                "        .highlight {\n" +
                "            background-color: #f0f0f0;\n" +
                "            padding: 10px;\n" +
                "            border-left: 5px solid #ccc;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "    <header>\n" +
                "        <h1>Bem-vindo ao Mundo dos Textos Aleatórios</h1>\n" +
                "        <p>Aqui você encontrará uma coleção de textos e títulos fictícios para ilustrar uma página HTML de exemplo.</p>\n" +
                "    </header>\n" +
                "\n" +
                "    <section>\n" +
                "        <h2>Seção 1: A História dos Textos Fictícios</h2>\n" +
                "        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur euismod, nulla vel bibendum fringilla, mauris risus sodales urna, a bibendum metus ipsum non ligula. Integer vel elit nec nulla accumsan malesuada.</p>\n" +
                "        <div class=\"highlight\">\n" +
                "            <p>Vivamus fermentum quam non risus egestas, a gravida justo faucibus. Nam fringilla metus non lacus sodales, ac aliquam neque convallis.</p>\n" +
                "        </div>\n" +
                "    </section>\n" +
                "\n" +
                "    <section>\n" +
                "        <h2>Seção 2: Utilização Prática de Conteúdos Falsos</h2>\n" +
                "        <p>Proin nec eros ut arcu convallis laoreet. Sed scelerisque magna in purus ullamcorper, nec volutpat tortor fermentum. Ut vehicula ligula nec justo feugiat, ac pharetra metus ultricies.</p>\n" +
                "    </section>\n" +
                "\n" +
                "    <section>\n" +
                "        <h3>Subseção: Exemplo de Subtítulo</h3>\n" +
                "        <p>Integer dignissim, metus in dictum mollis, arcu sapien laoreet augue, ut dictum ex ligula non sapien. Aenean nec nunc ac nisi convallis auctor. Curabitur ut orci vel augue dapibus bibendum.</p>\n" +
                "    </section>\n" +
                "\n" +
                "    <footer>\n" +
                "        <h2>Conclusão</h2>\n" +
                "        <p>Suspendisse potenti. Morbi in nisl sit amet metus convallis tincidunt. Nulla facilisi. Donec non lacus nec ipsum ullam\n";
    }
}
