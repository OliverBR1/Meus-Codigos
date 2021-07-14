function getRandomInt(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min)) + min;
}



function consultarDisponivel() {
    var v151 = getRandomInt(0, 20)
    var v152 = getRandomInt(0, 20)
    var v153 = getRandomInt(0, 20)
    var v154 = getRandomInt(0, 20)
    var v155 = getRandomInt(0, 20)
    var v156 = getRandomInt(0, 20)
    var v157 = getRandomInt(0, 20)
    var v158 = getRandomInt(0, 20)

    document.getElementById('v151').innerText = v151
    document.getElementById('v152').innerText = v152
    document.getElementById('v153').innerText = v153
    document.getElementById('v154').innerText = v154
    document.getElementById('v155').innerText = v155
    document.getElementById('v156').innerText = v156
    document.getElementById('v157').innerText = v157
    document.getElementById('v158').innerText = v158
}

function reservarVoo() {
    var numvoo = parseInt(document.getElementById('numvoo').value)
    switch (numvoo) {

        case 151:
            v151 = parseInt(document.getElementById('v151').innerText)
            if (v151 <= 0) {
                document.getElementById('m1').innerText = "Sem vagas."
                document.getElementById('mensagem').innerText = null
                break
            } else {
                v151--
                document.getElementById('v151').innerText = v151
                document.getElementById('mensagem').innerText = "Reserva feita com sucesso."
                break;
            }

        case 152:
            v152 = parseInt(document.getElementById('v152').innerText)
            if (v152 <= 0) {
                document.getElementById('m2').innerText = "Sem vagas."
                document.getElementById('mensagem').innerText = null
                break
            } else {
                v152--
                document.getElementById('v152').innerHTML = v152
                document.getElementById('mensagem').innerText = "Reserva feita com sucesso."
                break;
            }
        case 153:
            v153 = parseInt(document.getElementById('v153').innerText)
            if (v153 <= 0) {
                document.getElementById('m3').innerText = "Sem vagas."
                document.getElementById('mensagem').innerText = null
                break
            } else {
                v153--
                document.getElementById('v153').innerHTML = v153
                document.getElementById('mensagem').innerText = "Reserva feita com sucesso."
                break;
            }
        case 154:
            v154 = parseInt(document.getElementById('v154').innerText)
            if (v154 <= 0) {
                document.getElementById('m4').innerText = "Sem vagas."
                document.getElementById('mensagem').innerText = null
                break
            } else {
                v154--
                document.getElementById('v154').innerHTML = v154
                document.getElementById('mensagem').innerText = "Reserva feita com sucesso."
                break;
            }
        case 155:
            v155 = parseInt(document.getElementById('v155').innerText)
            if (v155 <= 0) {
                document.getElementById('m5').innerText = "Sem vagas."
                document.getElementById('mensagem').innerText = null
                break
            } else {
                v155--
                document.getElementById('v155').innerHTML = v155
                document.getElementById('mensagem').innerText = "Reserva feita com sucesso."
                break;
            }
        case 156:
            v156 = parseInt(document.getElementById('v156').innerText)
            if (v156 <= 0) {
                document.getElementById('m6').innerText = "Sem vagas."
                document.getElementById('mensagem').innerText = null
                break
            } else {
                v156--
                document.getElementById('v156').innerHTML = v156
                document.getElementById('mensagem').innerText = "Reserva feita com sucesso."
                break;
            }
        case 157:
            v157 = parseInt(document.getElementById('v157').innerText)
            if (v157 <= 0) {
                document.getElementById('m7').innerText = "Sem vagas."
                document.getElementById('mensagem').innerText = null
                break
            } else {
                v157--
                document.getElementById('v157').innerHTML = v157
                document.getElementById('mensagem').innerText = "Reserva feita com sucesso."
                break;
            }
        case 158:
            v158 = parseInt(document.getElementById('v158').innerText)
            if (v158 <= 0) {
                document.getElementById('m8').innerText = "Sem vagas."
                document.getElementById('mensagem').innerText = null
                break
            } else {
                v158--
                document.getElementById('v158').innerHTML = v158
                document.getElementById('mensagem').innerText = "Reserva feita com sucesso."
                break;
            }
        default:
            document.getElementById('mensagem').innerHTML = "Não possuimos o vôo com esse número!"

    }

}


