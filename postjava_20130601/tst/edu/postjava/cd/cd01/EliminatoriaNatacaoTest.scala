package edu.postjava.cd.cd01


import org.junit._
import Assert._
import edu.postjava.cd.cd01.EliminatoriaNatacao

class EliminatoriaNatacaoTest {

  @Test
  def testInfantilA() {
    val idade=6
    val  e:EliminatoriaNatacao = new EliminatoriaNatacao()
    val resultado =e.mostrarCategoria(idade)
    assertTrue(resultado=="InfantilA")
  }  
  
}