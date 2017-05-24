import {Injectable, OnInit} from "@angular/core";
import {Headers, Http, RequestOptions} from "@angular/http";
import {UserModel} from "./user.model";
/**
 * Created by bishal on 5/21/17.
 */

@Injectable()
export class Login implements OnInit{
  private resourceUrl = 'http://localhost:9001/api';
  private headers: Headers;

  constructor(private http: Http) {
    this.headers= new Headers();
  }

  ngOnInit(){
  }

  test(){
    this.headers =new Headers();
    this.headers.append("Authorization", "Basic " + localStorage.getItem('token'));
    console.log(this.headers.values());
    let options = new RequestOptions({headers: this.headers});
    return this.http.get('http://localhost:9001/login',options).subscribe(
      data => { console.log(data); },
      err => { console.log(err); }
    );
  }

  authentication(token: string){
    this.headers =new Headers();
    this.headers.append("Authorization", "Basic " + token);
  }

  create(token: string){
    // let headers = new Headers();
    // this.headers.append('Content-Type', 'application/json');
    this.headers =new Headers();
    this.headers.append("Authorization", "Basic " + token);
    this.authentication(token);
    console.log(this.headers.values());
    let options = new RequestOptions({headers: this.headers});
    return this.http.post(this.resourceUrl,"hi im body",options).subscribe(
      data => { console.log(data); localStorage.setItem('token',token); },
      err => { console.log(err); localStorage.removeItem('token')}
    );
  }

  isAuthenticated():boolean{
    console.log("printed token"+localStorage.getItem("token"));
    if(localStorage.getItem("token") === null){
      return false;
    }else {
      return true;
    }
  }

  createUser(user : UserModel){
    console.log(user);
    this.headers =new Headers();
    this.headers.append("Authorization", "Basic " + localStorage.getItem('token'));
    this.authentication(localStorage.getItem('token'));
    console.log(this.headers.values());
    let options = new RequestOptions({headers: this.headers});
    this.http.post('http://localhost:9001/signUps',user,options).subscribe(
      data => { console.log(data); },
      err => { console.log(err);}
    );
  }

}
