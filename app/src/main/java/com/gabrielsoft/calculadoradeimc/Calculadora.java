package com.gabrielsoft.calculadoradeimc;

import android.widget.ImageView;
import android.widget.TextView;

public class Calculadora {
    private double altura, peso, IMC;

    public Calculadora(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
        calcularIMC();
    }

    public void telaResultado(TextView textView, ImageView imagemResultado){
      if(IMC < 18.5f){
          textView.setText(R.string.magro);
          imagemResultado.setImageResource(R.drawable.magro_drawable);

      }else if (IMC >= 18.5 && IMC < 25){
          textView.setText(R.string.ideal);
          imagemResultado.setImageResource(R.drawable.ideal_drawable);

      }else if (IMC >= 25 && IMC < 30){
          textView.setText(R.string.levemente_acima);
          imagemResultado.setImageResource(R.drawable.levemente_acima_drawable);

      }else if (IMC >= 30 && IMC < 35){
          textView.setText(R.string.obesidade1);
          imagemResultado.setImageResource(R.drawable.obesidade1_drawable);

      }else if (IMC >= 35 && IMC < 40){
          textView.setText(R.string.obesidade2);
          imagemResultado.setImageResource(R.drawable.obesidade2_drawable);

      }else if (IMC > 40){
          textView.setText(R.string.obesidade3);
          imagemResultado.setImageResource(R.drawable.obesidade3_drawable);
      }

    }

    public void calcularIMC() {
        IMC = peso / (altura * altura);

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return IMC;
    }
}
