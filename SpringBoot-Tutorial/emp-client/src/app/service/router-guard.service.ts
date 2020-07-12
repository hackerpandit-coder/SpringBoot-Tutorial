import { Injectable } from '@angular/core';
import { CanActivate ,Router, ActivatedRouteSnapshot,RouterStateSnapshot} from '@angular/router';
import { AuthGuardService } from './auth-guard.service';

@Injectable({
  providedIn: 'root'
})
export class RouterGuardService implements CanActivate {

  constructor(private hardcodeAuthService:AuthGuardService,private router: Router) { }

  canActivate(route:ActivatedRouteSnapshot ,state: RouterStateSnapshot)
  {
     if(this.hardcodeAuthService.isLoggedIn())
        return true;
        else
        {
          this.router.navigate(['login']);
          false;
        }
       
  }
}
