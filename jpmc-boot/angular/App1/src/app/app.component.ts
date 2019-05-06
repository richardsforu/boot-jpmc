import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  prods:any;
  ngOnInit() {
  
   let url="http://localhost:8080/api/product/" ;
   this.http.get(url).subscribe(data=>this.prods=data)

  }
  title = 'App1';

  constructor(private http:HttpClient ){}
}
