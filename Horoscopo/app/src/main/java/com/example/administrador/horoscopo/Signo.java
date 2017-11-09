package com.example.administrador.horoscopo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Signo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);
        try {
            ImageView imgSigno = (ImageView)findViewById(R.id.signos);
            TextView   descrip = (TextView)findViewById(R.id.descrip);
            TextView   nombr = (TextView)findViewById(R.id.nombreus);
            TextView   nombranim = (TextView)findViewById(R.id.txtAnimal);
            Integer anio = (Integer) getIntent().getSerializableExtra("anioUsuario");
            String nombreu = (String) getIntent().getSerializableExtra("nombreUsuario");
            nombr.setText(nombreu);
            if (anio==1932||anio==1944 || anio==1956||anio==1968||anio==1980||anio==1992||anio==2004||anio==2016){
                imgSigno.setImageResource(R.drawable.monkey);
                descrip.setText(R.string.descMono);
                nombranim.setText("Mono");
            }else{if (anio==1933||anio==1945 || anio==1957||anio==1969||anio==1981||anio==1993||anio==2005||anio==2017){
                imgSigno.setImageResource(R.drawable.rooster);
                descrip.setText(R.string.descGallo);
                nombranim.setText("Gallo");
            }else{
                if (anio==1934||anio==1946 || anio==1958||anio==1970||anio==1982||anio==1994||anio==2006){
                    imgSigno.setImageResource(R.drawable.dog);
                    descrip.setText(R.string.descPerro);
                    nombranim.setText("Perro");

                }else{
                    if (anio==1935||anio==1947 || anio==1959||anio==1971||anio==1983||anio==1995||anio==2007){
                        imgSigno.setImageResource(R.drawable.pig);
                        descrip.setText(R.string.descChancho);
                        nombranim.setText("Cerdo");
                    }else{
                        if (anio==1936||anio==1948 || anio==1960||anio==1972||anio==1984||anio==1996||anio==2008){
                            imgSigno.setImageResource(R.drawable.rat);
                            descrip.setText(R.string.descRata);
                            nombranim.setText("Rata");
                        }else {if (anio==1937||anio==1949 || anio==1961||anio==1973||anio==1985||anio==1997||anio==2009){
                            imgSigno.setImageResource(R.drawable.ox);
                            descrip.setText(R.string.descBufalo);
                            nombranim.setText("Bufalo");
                        }else{
                            if (anio==1938||anio==1950 || anio==1962||anio==1974||anio==1986||anio==1998||anio==2010){
                                imgSigno.setImageResource(R.drawable.tiger);
                                descrip.setText(R.string.descTigre);
                                nombranim.setText("Tigre");

                            }else {
                                if (anio==1939||anio==1951 || anio==1963||anio==1975||anio==1987||anio==1999||anio==2011){
                                    imgSigno.setImageResource(R.drawable.rabbit);
                                    descrip.setText(R.string.descConejo);
                                    nombranim.setText("Conejo");
                                }else {
                                    if (anio==1940||anio==1952 || anio==1964||anio==1976||anio==1988||anio==2000||anio==2012){
                                        imgSigno.setImageResource(R.drawable.dragon);
                                        descrip.setText(R.string.descDragon);
                                        nombranim.setText("Dragon");
                                    }else{if (anio==1941||anio==1953 || anio==1965||anio==1977||anio==1989||anio==2001||anio==2013){
                                        imgSigno.setImageResource(R.drawable.snake);
                                        descrip.setText(R.string.descSerpiente);
                                        nombranim.setText("Serpiente");
                                    }else{
                                        if (anio==1942||anio==1954 || anio==1966||anio==1978||anio==1990||anio==2002||anio==2014){
                                            imgSigno.setImageResource(R.drawable.horse);
                                            descrip.setText(R.string.descCaballo);
                                            nombranim.setText("Caballo");
                                        }else{
                                            if (anio==1943||anio==1955 || anio==1967||anio==1979||anio==1991||anio==2003||anio==2015){
                                                imgSigno.setImageResource(R.drawable.goat);
                                                descrip.setText(R.string.descCabra);
                                                nombranim.setText("Cabra");
                                            }
                                        }
                                    }
                                    }
                                }
                            }

                        }
                        }
                    }
                }
            }
            }











        }catch (Exception e){
            System.out.println(e);
        }


    }
}
