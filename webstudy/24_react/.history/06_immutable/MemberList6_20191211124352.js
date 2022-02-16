class MemberList extends React.Component {

    getData() {
        const data = [
            {name: '홍1', email: 'hong1@a.com'},
            {name: '홍2', email: 'hong2@a.com'},
            {name: '홍3', email: 'hong3@a.com'}
        ];
        return data.
    }


    render() {
        return (
            <div>
                <div>
                    <span>홍1</span>
                    <span>hong1@a.com</span>
                </div>
                <div>
                    <span>홍2</span>
                    <span>hong2@a.com</span>
                </div>
                <div>
                    <span>홍3</span>
                    <span>hong3@a.com</span>
                </div>
            </div>
        );
    }
}