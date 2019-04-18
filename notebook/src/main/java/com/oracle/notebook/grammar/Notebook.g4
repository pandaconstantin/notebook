grammar Notebook;
import Python3 ;
codejson : OPEN_BRACE 'code' ':' (value) CLOSE_BRACE ;
value: (MOD) ('python') (single_input)+ ;

//WS : [ \t\r\n]+ -> skip ;

