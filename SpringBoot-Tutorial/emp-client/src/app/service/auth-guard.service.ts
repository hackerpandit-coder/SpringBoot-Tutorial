import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService {

  constructor() { }

  authentication(username:string,password:string):boolean
  {
    // console.log('Before Login--'+this.isLoggedIn());
    if(username==='Viru' && password==='Golden@1995')
    {
      
      sessionStorage.setItem('validUserName',username);
      // console.log('After Login--'+this.isLoggedIn());
      return true;
    } 
    else
    return false;
  }

  isLoggedIn():boolean
  {
    let user =sessionStorage.getItem('validUserName');
    return !(user===null);
  }
  logout()
  {
    sessionStorage.removeItem('validUserName');
  }
}
