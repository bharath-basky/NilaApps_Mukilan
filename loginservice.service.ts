import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { DataMap } from '../../AppTypes/Apptypes';
@Injectable()
export class LoginserviceService {

    constructor(private http: HttpClient) { }

    getData(model: DataMap) {
        return this.http.post("/digitalapplication/getData", { requestData: model });
    }
}


