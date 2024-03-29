package AnalizadorLexico;

public interface ParserConstants
{
    int START_SYMBOL = 43;

    int FIRST_NON_TERMINAL    = 43;
    int FIRST_SEMANTIC_ACTION = 85;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2,  2, -1,  2, -1,  2,  2,  2, -1,  2,  2,  2,  2, -1,  2, -1,  1, -1, -1 },
        { -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3,  4, -1,  4, -1,  3,  4,  3, -1,  4,  4,  4,  3, -1,  3, -1, -1, -1, -1 },
        { -1,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5,  6,  6, -1, -1,  5, -1, -1,  5,  5,  5, -1, -1, -1,  6, -1, -1,  6 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, 34, -1, 34, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, 14, -1, 14, -1, -1, -1, -1, 14, -1, 14, -1, -1, -1, -1 },
        { -1,  7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, 10, -1, -1,  9,  9,  8, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, 47, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1 },
        { -1, 57, 57, 57, 57, 57, 57, -1, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, -1, -1, -1, 57, 58, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1 },
        { -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, 31, -1, -1, 31, -1, -1, 31, 31, 31, -1, -1, -1, -1, -1, 30, 31 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, -1, -1, -1, 16, -1, 17, -1, -1, -1, -1, 18, -1, 19, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, 20, -1, -1, -1, -1, 20, -1, 20, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, 22, -1, 22, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, -1, -1, -1, -1, 25, -1, 25, -1, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, 27, -1, 28, -1, -1, -1, -1, 29, -1, -1, -1, -1, -1, -1 },
        { -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, 37, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 40, 41, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 50, 50, 50, 50, 50, 50, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 63, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, 66, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, 61, -1, -1, -1, -1, -1, -1, -1, 60, 60, -1, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 67, 67, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 69, 69, -1, 68, 68, 68, 68, 68, 68, 69, 69, -1, 69, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, 71, 72, 73, 74, 75, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 76, 76, 76, 76, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, 78, 79, -1, -1, -1, 77, 77, -1, 77, 77, 77, 77, 77, 77, 77, 77, -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 80, 80, 80, 80, 80, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 84, 85, 86, 87, 89, 90, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 88, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, 81, 81, 82, 83, -1, 81, 81, -1, 81, 81, 81, 81, 81, 81, 81, 81, -1, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, 91, 91, 91, 91, -1, 91, 91, -1, 91, 91, 91, 91, 91, 91, 91, 91, 92, 91, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 100,  32,  44,  45,  46,  27, 101 },
        {  40,  47,  44 },
        {   0 },
        {  48,  45 },
        {   0 },
        {  49,  46 },
        {   0 },
        {   2, 110,  50 },
        {  51 },
        {  52 },
        {  53 },
        {  54 },
        {  10,  55, 114, 185,  21 },
        {  22,  56,  23,  21 },
        {  59,   2,  22,  60,  23,  57,  46,  58,  27 },
        {  24 },
        {  29 },
        {  31 },
        {  36 },
        {  38 },
        {  61 },
        {   0 },
        {  63,  62 },
        {  20,  61 },
        {   0 },
        {  64, 109,   2, 110, 111 },
        {  24 },
        {  29 },
        {  31 },
        {  36 },
        {  41,  47,  57 },
        {   0 },
        {  42,  55,  21 },
        {   0 },
        {  64, 109,  65, 111,  66, 185,  21 },
        {   2, 110,  67 },
        {  20,   2, 110,  67 },
        {   0 },
        {  10,  68, 115 },
        {   0 },
        {   3,  90 },
        {   4,  91 },
        {   5, 107 },
        {  37,  96 },
        {  28,  97 },
        {  35,  22,  65, 112,  23,  21 },
        {  69 },
        {  70 },
        {  33,  22,  71,  23,  21 },
        {  34,  22,  71, 102,  23,  21 },
        {  55,  99,  72 },
        {  20,  71 },
        {   0 },
        {  30,  22,  55, 116,  23,  46,  73,  27, 117,  21 },
        {  26, 118,  46 },
        {   0 },
        {  25, 119,  46,  39,  22,  55, 120,  23,  21 },
        {  71 },
        {   0 },
        {  74,  75 },
        {   0 },
        {  12,  74, 103,  75 },
        {  11,  74, 104,  75 },
        {  76 },
        {  37,  96 },
        {  28,  97 },
        {  13,  74,  98 },
        {  79,  77 },
        {  78, 105,  79, 106 },
        {   0 },
        {  14 },
        {  15 },
        {  16 },
        {  17 },
        {  18 },
        {  19 },
        {  81,  80 },
        {   0 },
        {   6,  81,  86,  80 },
        {   7,  81,  87,  80 },
        {  82,  83 },
        {   0 },
        {   8,  82,  88,  83 },
        {   9,  82,  89,  83 },
        {   2, 113,  84 },
        {   3,  90 },
        {   4,  91 },
        {   5, 107 },
        {  22,  55,  23 },
        {   6,  82, 108 },
        {   7,  82,  92 },
        {   0 },
        {  22,  71,  23 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado identificador",
        "Era esperado const_integer",
        "Era esperado const_float",
        "Era esperado const_string",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"*\"",
        "Era esperado \"/\"",
        "Era esperado \"=\"",
        "Era esperado \"&&\"",
        "Era esperado \"||\"",
        "Era esperado \"!\"",
        "Era esperado \"==\"",
        "Era esperado \"!=\"",
        "Era esperado \"<\"",
        "Era esperado \"<=\"",
        "Era esperado \">\"",
        "Era esperado \">=\"",
        "Era esperado \",\"",
        "Era esperado \";\"",
        "Era esperado \"(\"",
        "Era esperado \")\"",
        "Era esperado boolean",
        "Era esperado do",
        "Era esperado else",
        "Era esperado end",
        "Era esperado false",
        "Era esperado float",
        "Era esperado if",
        "Era esperado integer",
        "Era esperado main",
        "Era esperado print",
        "Era esperado println",
        "Era esperado scan",
        "Era esperado string",
        "Era esperado true",
        "Era esperado void",
        "Era esperado while",
        "Era esperado global",
        "Era esperado local",
        "Era esperado return",
        "Era esperado main", //"<programa> inv�lido"
        "Era esperado boolean, do, else, end, float, if, integer, print, printnl, scan, string, void, global", //"<variaveis_globais> inv�lido"
        "Era esperado identificador, boolean, do, end, float, if, integer, print, println, scan, string, void", //"<lista_modulos> inv�lido",
        "Era esperado identificador, do, else, end, if, print, println, scan, while, return",//"<lista_comandos> inv�lido",
        "Era esperado boolean, float, integer, string",//"<variaveis> inv�lido",
        "Era esperado boolean, float, integer, string, void",//"<modulo> inv�lido",
        "Era esperado identificador, do, if, print, println, scan",//"<comando> inv�lido",
        "Era esperado =, (",//"<comando2> inv�lido",
        "Era esperado scan",//"<entrada> inv�lido",
        "Era esperado print, println",//"<saida> inv�lido",
        "Era esperado if",//"<selecao> inv�lido",
        "Era esperado do",//"<repeticao> inv�lido",
        "Era esperado identificador, constante integer, constante float, constante string, +, -, !, (, false, true",//"<expressao> inv�lido",
        "Era esperado identificador, constante integer, constante float, constante string, +, -, !, (, ), false, true",//"<parametros_reais> inv�lido",
        "Era esperado identificador, do, end, if, print, println, scan, local, return",//"<variaveis_locais> inv�lido",
        "Era esperado end, return",//"<retorno> inv�lido",
        "Era esperado boolean, float, integer, string, void",//"<tipo_modulo> inv�lido",
        "Era esperado ), boolean, float, integer, string",//"<lista_parametros> inv�lido",
        "Era esperado boolean, float, integer, string",//"<lista_parametros2> inv�lido",
        "Era esperado ,, )",//"<lista_parametros3> inv�lido",
        "Era esperado boolean, float, integer, string",//"<parametro> inv�lido",
        "Era esperado boolean, float, integer, string" /*"<tipo> inv�lido"*/,
        "Era esperado identificador",//"<lista_identificadores> inv�lido",
        "Era esperado =, ;",//"<valor> inv�lido",
        "Era esperado identificador, =, ;, )",//"<lista_identificadores2> inv�lido",
        "Era esperado constante integer, constante float, constante string, false, true",//"<constante> inv�lido",
        "Era esperado print",//"<print> inv�lido",
        "Era esperado println",//"<println> inv�lido",
        "Era esperado identificador, constante integer, constante float, constante string, +, -, !, (, false, true",//"<lista_expressoes> inv�lido",
        "Era esperado ,, )",//"<lista_expressoes2> inv�lido",
        "Era esperado else, end",//"<else> inv�lido",
        "Era esperado identificador, constante integer, constante float, constante string, +, -, !, (, false, true",//"<elemento> inv�lido",
        "Era esperado &&, ||, ,, ;, )",//"<expressao2> inv�lido",
        "Era esperado identificador, constante integer, constante float, constante string, +, -, (",//"<relacional> inv�lido",
        "Era esperado &&, ||, ==, !=, <, <=, >, >=, ,, ;, )",//"<relacional2> inv�lido",
        "Era esperado ==, !=, <, <=, >, >=",//"<operador_relacional> inv�lido",
        "Era esperado identificador, constante integer, constante float, constante string, +, -, (",//"<aritmetica> inv�lido",
        "Era esperado +, -, &&, ||, ==, !=, <, <=, >, >=, ,, ;, )",//"<aritmetica2> inv�lido",
        "Era esperado identificador, constante integer, constante float, constante string, +, -, (",//"<termo> inv�lido",
        "Era esperado identificador, constante integer, constante float, constante string, +, -, (" /*"<fator> inv�lido"*/ ,
        "Era esperado +, -, *, /, &&, ||, ==, !=, <, <=, >, >=, ,, ;, )",//"<termo2> inv�lido",
        "Era esperado +, -, *, /, &&, ||, ==, !=, <, <=, >, >=, ,, ;, (, )",//"<fator2> inv�lido"
    };
}
